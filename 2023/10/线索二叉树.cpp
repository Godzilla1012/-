#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>

typedef struct TreeNode {
	int value;
	struct TreeNode* left;
	struct TreeNode* right;
	int LTag, RTag;
}TreeNode;
TreeNode* CreatTree() {

	int ch;
	scanf("%d", &ch);
	if (ch == 0)
		return NULL;
	TreeNode* root = (TreeNode*)malloc(sizeof(TreeNode));

	root->value = ch;

	printf("������%d������(����0��ʾ��)\n", ch);
	root->left = CreatTree();
	printf("������%d���Һ���(����0��ʾ��)\n", ch);
	root->right = CreatTree();
	return root;
}
void InThreading(TreeNode* p,TreeNode* pre) {
	if (p) {
		InThreading(p->left, pre);
		if (!p->left) {         //ǰ������
			p->LTag = 0;
			p->left = pre;
		}
		else {
			p->LTag = 1;
		}
		if (!pre->right) {      //�������
			pre->RTag = 0;
			pre->right = p;
		}
		else {
			pre->RTag = 1;
		}
		pre = p;
		InThreading(p->right,pre);
	}
}
TreeNode* InOrderThreading(TreeNode* T) {
	TreeNode* Thrt = (TreeNode*)malloc(sizeof(TreeNode));
	TreeNode* pre;
	
	Thrt->LTag=1;
	Thrt->RTag = 0;
	Thrt->right = Thrt;    //��ָ���ָ
	if (!T)Thrt->left = Thrt; //�����������,��ָ���ָ
	else {
		Thrt->left = T;
		T->LTag = 1;
		T->RTag = 1;
		pre = Thrt;
		InThreading(T,Thrt);
		pre->right = Thrt;
		pre->RTag = 0;
		Thrt->right = pre;


	}
	return Thrt;
}

void InOrderTracerse(TreeNode* T) {
	TreeNode* p = T->left;
	while (p != T) {
		while (p->LTag == 1) {                  //���p->left��Ϊ��,����p->left
			p = p->left;
		}
		printf("%d ", p->value);                  //����������Ϊ�յĽڵ�
		while (p->RTag == 0 && p->right != T) {  //���p->rightΪ��,���ʺ�̽ڵ�
			p = p->right;
			printf("%d ", p->value);
		}
		p = p->right;
	}

}
int main() {
	TreeNode* T = CreatTree();
	TreeNode* head=InOrderThreading(T);
	InOrderTracerse(head);
}