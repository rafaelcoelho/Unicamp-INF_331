package pt.c08componentes.s10statistics.s02interface;

public class AppStatistics02 {
	public static void main(String args[])
	{
		try {
			IStatistics st = new Statistics();

			st.insertValue(50);
			st.insertValue(70);
			st.insertValue(30);
			System.out.println("Sum is: " + st.sum());
			System.out.println("Avg is: " + st.average());


		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
