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
void InThreading(TreeNode* p,int Link,int Thread) {
	if (p) {
		InThreading(p->left,Link,Thread);
		if (!p->left) {
			p->LTag = Thread;
			p->left = pre;
		}
	}
}
void InOrderThreading(TreeNode* T) {
	TreeNode* Thrt = (TreeNode*)malloc(sizeof(TreeNode));
	TreeNode* pre;
	if (!Thrt)return;
	int Link = 1,Thread=0;
	Thrt->LTag=Link;
	Thrt->RTag = Thread;
	Thrt->right = Thrt;    //��ָ���ָ
	if (!T)Thrt->left = Thrt; //�����������,��ָ���ָ
	else {
		Thrt->left = T;
		pre = Thrt;
		InThreading(T,Link,Thread);
	}

}
int main() {

}