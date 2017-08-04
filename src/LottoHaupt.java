import java.util.HashSet;
import java.util.Set;

public class LottoHaupt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> lotto = new HashSet<Integer>();

		while(lotto.size() < 7) {
			lotto.add((int) Math.random()*48);
			System.out.println("Schleife");
		}
	}
}
