package penta.java.oops;

interface Readable
{
	
	String read();
}
class TextMessage implements Readable
{

	String sender;
	String content;
	
	public TextMessage(String sender, String content) {
		super();
		this.sender = sender;
		this.content = content;
	}

	@Override
	public String read() {
		// TODO Auto-generated method stub
		return content;
	}
	String sender()
	{
		return sender;
	}
}
class Ebook implements Readable
{

	String author;
	String content;
	
	public Ebook(String author, String content) {
		
		this.author = author;
		this.content = content;
	}

	@Override
	public String read() {
		// TODO Auto-generated method stub
		return content;
	}
}
public class InterfaceExample {

	public static void main(String[] args) {
		
		TextMessage textmessage=new TextMessage("Yeshwanth","Hi, Hello I'm done with my session, coming home prepare biriyani");
		
		System.out.println("Message From : "+textmessage.sender);
		System.out.println("Message is : "+textmessage.read());
	}

}
