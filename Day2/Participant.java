package Day2;

public class Participant extends Trainer {
	Participant(){
		System.out.println("Learning java inheritence");
	}
void learning(String stream1,String stream2) {
	System.out.println(stream1 +""+ stream2);
}
public static void main(String args[]) {
	Participant participant = new Participant();
	participant.learning("Java", "Python");
	// participant.training("Java SE");
}
}
