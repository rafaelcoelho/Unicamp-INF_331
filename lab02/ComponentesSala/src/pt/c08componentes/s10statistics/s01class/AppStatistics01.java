package pt.c08componentes.s10statistics.s01class;

public class AppStatistics01 {
	public static void main(String args[])
	{
		try {
			Statistics st = new Statistics();

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
