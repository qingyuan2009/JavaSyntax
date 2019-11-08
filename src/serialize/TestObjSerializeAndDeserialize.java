package serialize;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.text.MessageFormat;

public class TestObjSerializeAndDeserialize {

	public static void main(String[] args) throws Exception {
		SerializePerson();// ���л�Person����
		Person p = DeserializePerson();// ������Perons����
		System.out.println(MessageFormat.format("name={0},age={1},sex={2}", p.getName(), p.getAge(), p.getSex()));	
	}

	private static void SerializePerson() throws FileNotFoundException, IOException {
		Person person = new Person();
		person.setName("gacl");
		person.setAge(25);
		person.setSex("��");
		// ObjectOutputStream �������������Person����洢��E�̵�Person.txt�ļ��У���ɶ�Person��������л�����
		ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(new File("E:/Person.txt")));
		oo.writeObject(person);
		System.out.println("Person�������л��ɹ���");
		oo.close();
	}

	private static Person DeserializePerson() throws Exception, IOException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("E:/Person.txt")));
		Person person = (Person) ois.readObject();
		System.out.println("Person�������л��ɹ���");
		return person;
	}

}

class Person implements Serializable {

	/**
	 * ���л�ID
	 */
	private static final long serialVersionUID = -5809782578272943999L;
	private int age;
	private String name;
	private String sex;

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getSex() {
		return sex;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
}
