/*
ѧ��
������
��̰�
*/
abstract class  Student
{
      abstract public void study();
       public  void sleep()
	{
	   System.out.println("����˯");
	}
}
class  BaseStudent extends Student
{
          public void study()
	{
	     System.out.println("����ѧϰ");
	}
}
class  DashStudent extends Student
{
          public void study()
	{
	      System.out.println("��Ŀѧϰ");
	}
         public void sleep()
	{
	       System.out.println("����˯");
	}
}
class  DoStudent
{
          public void dosome(Student stu)
	{
	      stu.study();
	      stu.sleep();
	}
}
class duotai2
{
          public static void main(String[] args)
	{
	     DoStudent ds = new DoStudent();
	     ds.dosome(new BaseStudent());
	      ds.dosome(new DashStudent());
	}
}