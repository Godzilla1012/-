package homework1026;

import java.math.BigInteger;
import java.time.Year;
import java.util.Scanner;

public class homework1026 {
    public static void main(String[] args) {
        long year;
        int mon;
        int []mon1={31,31,28,31,30,31,30,31,31,30,31,30};//12,1,2,3,4...月的天数
     //   int []mon2={31,29,31,30,31,30,31,31,30,31,30,31};

        int day;
        int hour;
        int min;
        int sec;
        Scanner sc=new Scanner(System.in);
        year= sc.nextLong();
        mon= sc.nextInt();
        day= sc.nextInt();
        hour= sc.nextInt();
        min= sc.nextInt();
        sec= sc.nextInt();

        while(sec>=60){   //秒数超过60时,进到分
            sec-=60;
            min++;
        }
        while(min>=60){
            min-=60;
            hour++;
        }
        while(hour>=24){
            hour-=24;
            day++;
        }
        int curMon;
        while(day>31){
            curMon=mon%12;
            day=day-mon1[curMon];      //根据当前月有多少天进多余的天数,直到小于等于31;
            mon++;
        }
        if(mon1[mon%12]==30&&day==31){  //如果该月有30天,但目前有31天,进位
            day-=30;
            mon++;
        }
        if(mon1[mon%12]==28&&day>28){  //如果该月有28天,但目前多余28天,进位
            day-=28;
            mon++;
        }
        while(mon>12){
            mon-=12;
            year++;
        }          //非闰年考虑完毕
        if(Year.isLeap(year)&&mon==2&&day>29){     //考虑闰年的二月,如果大于29,进位
            mon++;
            day-=29;
        }
        //生成北京时间
        System.out.println("北京时间为"+year+"-"+mon+"-"+day+" "+hour+":"+min+":"+sec);

        //纽约时间
        if(hour>=12) {        //如果时钟大于12,直接减
            hour -= 12;
        }
        else{                 //时钟小于12,借一天
            if(day>1){        //天数大于1,直接减
                day--;
                hour+=24;
                hour-=12;
            }
            else{              //天数小于1,向月借31天(1月有31天)
                if(mon>1){     //月份大于1,直接借
                    mon--;
                    day+=31;
                    day--;
                    hour+=24;
                    hour-=12;
                }
                else{          //月份为1,借12个月
                    year--;
                    mon+=12;
                    mon--;
                    day+=31;
                    day--;
                    hour+=24;
                    hour-=12;
                }
            }
        }
        System.out.println("纽约时间为"+year+"-"+mon+"-"+day+" "+hour+":"+min+":"+sec);
    }
}
