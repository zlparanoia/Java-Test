package show;

import java.util.Scanner;

/*

* 功能：根据用户输入的班级数、班级人数、班级里每位学生的成绩；分别计算各个班级的平均分数并将其输出。

*/

public class One {

public static void main(String[] args) {

Scanner input =new Scanner(System.in);

System.out.println("输入班级数：");

int classNum = input.nextInt();//输入班级数

double sum = 0;//每个班级的总成绩

for(int i = 1; i <= classNum; i++){//遍历班级

System.out.println("输入第"+ i +"个班级的学生人数：");

int stuNum = input.nextInt();//输入每个班级的学生人数

System.out.println("分别输入他们的成绩：");

for(int j = 1; j <= stuNum; j++){//遍历每个班级的学生人数输入每位学生的成绩

double score = input.nextDouble();//输入每位学生的成绩

sum += score;//对每位学生的成绩进行累加

}

System.out.println("第"+ i +"个班级的平均分为：");

double averScore = (sum/stuNum) ;//求每个班级的平均成绩

System.out.println(averScore);

sum = 0;//总成绩清零，对下一个班级的成绩重新进行累加

}

}

}

bug1: score设为int值却输入带有小数点的值。

solution:将score的类型改为double。



bug2:把score改为double类型后未改为.nextDouble。

solution：将nextInt()改为nextDouble(),int类型对应nextInt(),double类型对应nextDouble();



bug3:未把sum清零，导致累加入下一个班级的总成绩里。

solution: 在每次循环后添加sum = 0; 将sum归零。



PS: 由于averScore和score为块级作用域里的变量，因此不必清零。
