/*
1����̬������
	���������ָ�����Լ����������
	���������Ҳ���Խ����Լ����������
2����̬��ǰ��
	������������֮���й�ϵ��Ҫô�̳У�Ҫôʵ��
	ͨ������һ��ǰ�᣺���ڸ���
3����̬�ĺô�
	��̬�ĳ��ִ�����߳������չ�ԡ�
4����̬�ľ�����
	��Ȼ�������չ�ԣ�����ֻ��ʹ�ø�������÷��ʸ����еĳ�Ա
5����̬��Ӧ��
6����̬�ĳ����ڴ����е��ص㣨��̬ʹ�õ�ע�����
����
è������
*/
abstract class Animal
{
	abstract void eat();
}

class Cat extends Animal
{
        public void eat()
	{
	       System.out.println("����");
	}
        public void catchMouse()
	{
	        System.out.println("����");
	}
}
class Dog extends Animal
{
	public void eat()
	{
	        System.out.println("�Է�");
	}
	public void catchThief()
	{
	        System.out.println("����");
	}
}
class duotai
{
       public static void main(String[] args)
	{
		Animal a = new Cat();
		a.eat();
	//�����Ҫ����è�����з���ʱ����β�����
	//ǿ�ƽ���������ã�ת���������͡�
	Cat  c = (Cat)a;
	c.catchMouse();

	function(new Dog());
	Dog d = (Dog)a;
	d.catchThief();
	}

        public static void function(Animal a)
	{
	        a.eat(); 
	}
}