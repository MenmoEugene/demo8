/*
�������ݿ�Ĳ���
���ݣ��û���Ϣ
1���������ݿ⣬JDBC Hibernate
2���������ݿ�
	c create r read u update d delete
3���ر����ݿ����ӡ�
*/
interface UserInfoDao
{
	public void add(User user);
	public void delete(User user);
}

class UserInfoByJDBC implements UserInfoDao
{
	public void add(User user)
	{
		1���������ݿ⡣
		2��ʹ��SQL������������ݣ�
		3���ر����ݿ����ӡ�
	}
	public void delete(User user)
	{
		1���������ݿ⡣
		2��ʹ��SQL������ɾ�����ݣ�
		3���ر����ݿ����ӡ�
	}
}

class  DBOperate
{
	public static void main(String[] args) 
	{
		//UserInfoByJDBC ui = new UserInfoByJDBC();
		//UserInfoByHibernate ui = new UserInfoByHibernate();
		UserInfoDao ui = new UserInfoByJDBC();
		ui.add(user);
		ui.delete(user);
	}
}


class UserInfoByHibernate
{
	public void add(User user)
}