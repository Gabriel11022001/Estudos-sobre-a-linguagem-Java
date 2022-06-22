import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Locale;

public class TestandoNovaAPIDatas {

	public static void main(String[] args) {
		LocalDate dataDeHoje = LocalDate.now();
		System.out.println(dataDeHoje);
		LocalDate dataCopaDoMundo = LocalDate.of(2022, Month.OCTOBER, 1);
		Period periodo = Period.between(dataDeHoje, dataCopaDoMundo);
		int diferencaEmAnos = periodo.getYears();
		int diferencaEmMeses = periodo.getMonths();
		int diferencaEmDias = periodo.getDays();
		System.out.println("Faltam " + diferencaEmDias + " dias, " + diferencaEmMeses + " meses e " + diferencaEmAnos + " anos para a copa do mundo!");
	}
}
