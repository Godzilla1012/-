#define  _CRT_SECURE_NO_WARNINGS

#include<stdio.h>
#include<stdlib.h>
typedef struct ListNode{  
	int factor;
	int index;
	struct ListNode* next;
}ListNode;


ListNode CreatHead() {
	ListNode* head = (ListNode*)malloc(sizeof(ListNode));
	head->factor = 0;
	head->index = 0;
	head->next = NULL;
	return *head;
}


void CreatPolyn(ListNode* head, int f, int i) {
	ListNode* p;
	p = (ListNode*)malloc(sizeof(ListNode));
	p->factor = f;
	p->index = i;
	p->next = NULL;
	while (head->next != NULL)
		head = head->next;
	if(head->next==NULL)
	head->next = p;

}
void add(ListNode L1, ListNode L2) {

}
void Show(ListNode* L) {
	ListNode* p = L->next;
	while (p->next != NULL) {
		printf("%dX^%d+",p->factor,p->index);
		p=p->next;
	}
	printf("%dX^%d\n", p->factor, p->index);
}

int main() {
	ListNode L1=CreatHead();
	ListNode L2 = CreatHead();
	int m = 1,n=1;
	int f1, i1,f2,i2;
	while (1) {
		printf("请输入第一个多项式第%d项的系数和指数:\n", m);
		scanf("%d%d", &f1, &i1);
		if (f1 == 0)
			break;
		CreatPolyn(&L1,f1,i1);
		m++;
	}
	printf("第一个多项式为:");
	Show(&L1);

	while (1) {
		printf("请输入第二个多项式第%d项的系数和指数:\n", m);
		scanf("%d%d", &f2, &i2);
		if (f2 == 0)
			break;
		CreatPolyn(&L1, f2, i2);
		n++;
	}
	printf("第二个多项式为:");
	Show(&L2);


}