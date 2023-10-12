#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include <iostream>
using namespace std;
typedef struct Node {
	char data;
	Node* next;
}Node;
Node CreatHead() {
	Node *head =new Node();
	head->data = 0;
	head->next = NULL;
	return *head;
};

void Add(Node* head,char ch) {

	Node* NewNode = new Node();
	NewNode->data = ch;
	if (head->next == NULL)
	{
		head->next = NewNode;
		return;
	}
	while(head->next != NULL && head->next->data < ch){
		head = head->next;
	}

	NewNode->next = head->next;
	head->next = NewNode;

}
void deleteNode(Node* head, char ch) {
	while (head->next != NULL && head->next->data != ch) {
		head = head->next;
	} 
	if (head->next == NULL) {
		printf("û�ҵ�\n");
		return;

	}
	if (head->next->next == NULL)
	{
		head->next = NULL;
		return;
	}
	head->next = head->next->next;

}
void printList(Node* head) {
	while (head->next != NULL) {
		cout << head->next->data;
		head = head->next;
	}
	cout << endl;
}
int main() {
	Node list = CreatHead();
	char ch=1;	
	while (ch)
	{
		while (getchar() != '\n');
		printf("������Ҫ�������ĸ:");
		scanf("%c", &ch);
		if (ch == '0')
			break;
		if (ch != ' ' && ch != '\n')
		{
			Add(&list, ch);
			printf("��ǰ����ĸ��Ϊ:");
			printList(&list);
		}
	}
	ch = 1;
	while (ch)
	{

		while (getchar() != '\n');
		printf("������Ҫɾ������ĸ:");
		scanf("%c", &ch);
		if (ch != ' ' && ch != '\n')
		{
			deleteNode(&list, ch);
			printf("��ǰ����ĸ��Ϊ:");
			printList(&list);
		}
		if (ch == '0')
			break;
	}
}