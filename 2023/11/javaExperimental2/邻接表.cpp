#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<malloc.h>
#define MAX 20
typedef  int InfoType;
typedef struct ArcBox {      //�����
	int tailvex, headvex;         //����β��ͷ�ڵ��λ��
	struct ArcBox* hlink, * tlink;////������ͬͷ�ڵ��β�ڵ������
	InfoType info;
}ArcBox;
typedef struct VexNode {
	char data;   //�ý��洢������
	ArcBox* firstin, * firstout;//�ýڵ�ĵ�һ���뻡�ͳ���
}VexNode;
typedef struct {
	VexNode xlist[MAX];  //��ͷ
	int vexnum, arcnum;  //����ͼ�ĵ�ǰ�������ͻ���
}OLGraph;

int LocateVex(OLGraph* G,char v) {
	for (int i = 0; i < G->vexnum; i++) {
		if (G->xlist[i].data == v)
			return i;
	}
}
void CreatDG(OLGraph* G) {
	printf("����Ҫ�����ͼ�Ķ�����");
	scanf("%d", &G->vexnum);   //����Ҫ�����ͼ�Ķ�����
	getchar();
	for (int i = 0; i < G->vexnum; i++) {
		printf("�����%d�������ֵ", i + 1);
		scanf("%c", &G->xlist[i].data);
		getchar();
		G->xlist[i].firstin = NULL;
		G->xlist[i].firstout = NULL;         //��ʼ��ͼ�е�ÿһ�����
	}
	char v1, v2;        
	for (int k = 0; k < G->vexnum; k++) {
		printf("�����%d�����������յ�", k + 1);
		scanf("%c%c", &v1, &v2);
		int i = LocateVex(G, v1);
		int j = LocateVex(G, v2);  //	ȷ��v1��v2��G�е�λ��
		ArcBox* p = (ArcBox*)malloc(sizeof(ArcBox));
		*p = { i,j,G->xlist[j].firstin,G->xlist[i].firstout,NULL };//�Ի���㸳ֵ
		          //��ͬ��β            //��ͬ��ͷ
		G->xlist[j].firstin = p;
		G->xlist[i].firstout = p;
	}
}
int main() {
	OLGraph G;
	CreatDG(&G);
}