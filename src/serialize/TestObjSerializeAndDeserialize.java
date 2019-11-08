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
		SerializePerson();// 序列化Person对象
		Person p = DeserializePerson();// 反序列Perons对象
		System.out.println(MessageFormat.format("name={0},age={1},sex={2}", p.getName(), p.getAge(), p.getSex()));	
	}

	private static void SerializePerson() throws FileNotFoundException, IOException {
		Person person = new Person();
		person.setName("gacl");
		person.setAge(25);
		person.setSex("男");
		// ObjectOutputStream 对象输出流，将Person对象存储到E盘的Person.txt文件中，完成对Person对象的序列化操作
		ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(new File("E:/Person.txt")));
		oo.writeObject(person);
		System.out.println("Person对象序列化成功！");
		oo.close();
	}

	private static Person DeserializePerson() throws Exception, IOException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("E:/Person.txt")));
		Person person = (Person) ois.readObject();
		System.out.println("Person对象反序列化成功！");
		return person;
	}

}

class Person implements Serializable {

	/**
	 * 序列化ID
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
