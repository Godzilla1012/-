#if 0
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>

typedef struct TreeNode{
	int value;
	struct TreeNode* left;
	struct TreeNode* right;
}TreeNode;
void initTree(TreeNode* T) {
	T = (TreeNode*)malloc(sizeof(TreeNode));
	T->value = 0;
	T->left = NULL;
	T->right = NULL;
}

TreeNode* CreatTree() {
	
	int ch;
	scanf("%d", &ch);
	if (ch == 0)
		return NULL;
	TreeNode* root=(TreeNode*)malloc(sizeof(TreeNode));
	
	root->value = ch;

	printf("������%d������(����0��ʾ��)\n", ch);
	root->left=CreatTree();
	printf("������%d���Һ���(����0��ʾ��)\n", ch);
	root->right=CreatTree();
	return root;
}
void preorderTraver(TreeNode* T) {
	if (T==NULL)
		return;
	printf("%d ", T->value);
	preorderTraver(T->left);
	preorderTraver(T->right);

}
void inorderTraver(TreeNode* T) {
	if (T == NULL)
		return;
	inorderTraver(T->left);
	printf("%d ", T->value);
	inorderTraver(T->right);

}
void postorderTraver(TreeNode* T) {
	if (T == NULL)
		return;
	postorderTraver(T->left);
	postorderTraver(T->right);
	printf("%d ", T->value);
}
int main() {
	printf("��������ڵ�:");
	TreeNode* Tree=CreatTree();
	printf("\n����������Ϊ:");
	preorderTraver(Tree);
	printf("\n����������Ϊ:");
	inorderTraver(Tree);
	printf("\n����������Ϊ:");
	postorderTraver(Tree);
}
#endif