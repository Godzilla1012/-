#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<malloc.h>
#define MAX 20
typedef  int InfoType;
typedef struct ArcBox {      //弧结点
	int tailvex, headvex;         //弧的尾和头节点的位置
	struct ArcBox* hlink, * tlink;////有着相同头节点或尾节点的链域
	InfoType info;
}ArcBox;
typedef struct VexNode {
	char data;   //该结点存储的数据
	ArcBox* firstin, * firstout;//该节点的第一条入弧和出弧
}VexNode;
typedef struct {
	VexNode xlist[MAX];  //表头
	int vexnum, arcnum;  //有向图的当前顶点数和弧数
}OLGraph;

int LocateVex(OLGraph* G,char v) {
	for (int i = 0; i < G->vexnum; i++) {
		if (G->xlist[i].data == v)
			return i;
	}
}
void CreatDG(OLGraph* G) {
	printf("输入要构造的图的顶点数");
	scanf("%d", &G->vexnum);   //输入要构造的图的顶点数
	getchar();
	for (int i = 0; i < G->vexnum; i++) {
		printf("输入第%d个顶点的值", i + 1);
		scanf("%c", &G->xlist[i].data);
		getchar();
		G->xlist[i].firstin = NULL;
		G->xlist[i].firstout = NULL;         //初始化图中的每一个结点
	}
	char v1, v2;        
	for (int k = 0; k < G->vexnum; k++) {
		printf("输入第%d条弧的起点和终点", k + 1);
		scanf("%c%c", &v1, &v2);
		int i = LocateVex(G, v1);
		int j = LocateVex(G, v2);  //	确定v1和v2在G中的位置
		ArcBox* p = (ArcBox*)malloc(sizeof(ArcBox));
		*p = { i,j,G->xlist[j].firstin,G->xlist[i].firstout,NULL };//对弧结点赋值
		          //相同弧尾            //相同弧头
		G->xlist[j].firstin = p;
		G->xlist[i].firstout = p;
	}
}
int main() {
	OLGraph G;
	CreatDG(&G);
}