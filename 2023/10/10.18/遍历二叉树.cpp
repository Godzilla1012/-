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
void TraverTree(TreeNode* T) {
	if (T==NULL)
		return;
	printf("%d ", T->value);
	TraverTree(T->left);
	TraverTree(T->right);

}
int main() {
	printf("��������ڵ�");
	TreeNode* Tree=CreatTree();
	TraverTree(Tree);
}