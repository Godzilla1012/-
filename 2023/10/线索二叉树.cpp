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
	Thrt->right = Thrt;    //右指针回指
	if (!T)Thrt->left = Thrt; //如果二叉树空,左指针回指
	else {
		Thrt->left = T;
		pre = Thrt;
		InThreading(T,Link,Thread);
	}

}
int main() {

}