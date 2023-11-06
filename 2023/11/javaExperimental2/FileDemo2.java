import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) {
        File dir =new File("dir");
        boolean flag=dir.mkdir();//创建文件夹
        System.out.println("创建文件夹是否成功:"+flag);

        File dir1 =new File("dir1/dir2/dir3/dir4/");
        boolean flag2=dir1.mkdirs();//创建很多文件夹
        System.out.println("创建文件夹是否成功:"+flag2);

        //删除文件路径最后一个文件夹
        boolean del=dir1.delete();
        System.out.println("删除文件夹是否成功"+del);

        File f=new File("F:\\javacode");
        File files[]=f.listFiles();//返回f下子文件和子文件夹,返回类型为File型数组
        for (File tmp:files){
            if(tmp.isFile()){
                System.out.println("文件:"+tmp.getName());
            }else if(tmp.isDirectory()){//判断是否文件夹
                System.out.println("文件夹"+tmp.getName());
            }
        }
    }
}