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

	printf("请输入%d的左孩子(输入0表示空)\n", ch);
	root->left = CreatTree();
	printf("请输入%d的右孩子(输入0表示空)\n", ch);
	root->right = CreatTree();
	return root;
}
void InThreading(TreeNode* p,TreeNode* pre) {
	if (p) {
		InThreading(p->left, pre);
		if (!p->left) {         //前继线索
			p->LTag = 0;
			p->left = pre;
		}
		else {
			p->LTag = 1;
		}
		if (!pre->right) {      //后继线索
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
	Thrt->right = Thrt;    //右指针回指
	if (!T)Thrt->left = Thrt; //如果二叉树空,左指针回指
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
		while (p->LTag == 1) {                  //如果p->left不为空,访问p->left
			p = p->left;
		}
		printf("%d ", p->value);                  //访问左子树为空的节点
		while (p->RTag == 0 && p->right != T) {  //如果p->right为空,访问后继节点
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