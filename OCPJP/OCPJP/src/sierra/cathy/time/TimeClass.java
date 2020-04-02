package sierra.cathy.time;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.time.zone.ZoneRules;
import java.util.*;

public class TimeClass {
	
	
	

	public static void main(String[] args) {
		//Local Date Time
		//Using now()
		LocalDate nowDate=LocalDate.now();
		LocalTime nowTime=LocalTime.now();
		LocalDateTime nowDateTime=LocalDateTime.now();
		//Using of()
		LocalDate myDate1=LocalDate.of(2019, 05, 04);
		LocalTime myTime1=LocalTime.of(07, 43, 18, 310);
		LocalDateTime myDateTime1= LocalDateTime.of(myDate1, myTime1);
		//Using parse()
		LocalDate myDate2=LocalDate.parse("2019-05-04");
		LocalTime myTime2=LocalTime.parse("07:50:30.480");
		LocalDateTime myDateTime2=LocalDateTime.parse("2019-05-04T07:50:30.500");
		//Using formatter class
		DateTimeFormatter fm1=DateTimeFormatter.ofPattern("yyyy/MM/dd");
		DateTimeFormatter fm2=DateTimeFormatter.ofPattern("HH:mm:ss:SSS");
		DateTimeFormatter fm3=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss:SSS");
		LocalDate myDate3=LocalDate.parse("2019/05/04",fm1);
		LocalTime myTime3=LocalTime.parse("07:50:30:480",fm2);
		LocalDateTime myDateTime3=LocalDateTime.parse("2019/05/04 07:50:30:513",fm3);
		DateTimeFormatter fm4=DateTimeFormatter.ofPattern("'Year: 'yyyy', Month: 'MM', Day: 'dd', :: Hour: 'HH', Minutes: 'mm', Seconds: 'ss.SSS");
		
		
		//Local Date Time
		System.out.println("nowDateTime: "+nowDate);
		System.out.println("nowDateTime: "+nowTime);
		System.out.println("nowDateTime: "+nowDateTime);
		System.out.println("myDate1: "+myDate1);
		System.out.println("myTime1: "+myTime1);
		System.out.println("myDateTime1: "+myDateTime1);
		System.out.println("myDate2: "+myDate2);
		System.out.println("myTime2: "+myTime2);
		System.out.println("myDateTime2: "+myDateTime2);
		System.out.println("myDate3: "+myDate3);
		System.out.println("myTime3: "+myTime3);
		System.out.println("myDateTime3: "+myDateTime3);
		System.out.println("Formatted myDateTime3: "+myDateTime3.format(fm4) );
		System.out.println(myDateTime3.plusDays(3));
		System.out.println(myDateTime3.plusHours(12));
		System.out.println(myDateTime3.getDayOfWeek());
		
		
		
		
		//Zoned Date Time
		Set<String> zids=ZoneId.getAvailableZoneIds();
		List<String> zidList=new ArrayList<String>(zids);
		ZoneId zid1=null,zid2=null;
		Collections.sort(zidList);
		System.out.println("List of zone-ids: ");
		for(String z:zidList){
			System.out.println(z);
			if(z.contains("US/Pacific-New")){
				//System.out.println(z);
				zid1=ZoneId.of(z);
			}
			if(z.contains("Asia/Kolkata")){
				//System.out.println(z);
				zid2=ZoneId.of(z);
			}	
		}
		System.out.println("------------------------");
		ZonedDateTime zmyDateTime1=ZonedDateTime.of(myDateTime3,zid2);
		ZoneRules zrules=zid2.getRules();
		
		
		
		//Zoned Date Time
		System.out.println("zmyDate1: "+zmyDateTime1);
		System.out.println("zrules: "+zrules);
		System.out.println("zmyDateTime1.toInstant(): "+zmyDateTime1.toInstant());
		System.out.println("isDaylightSavings: "+zrules.isDaylightSavings(zmyDateTime1.toInstant()));
		System.out.println("------------------------\n\n");
		
		
		//Date-time adjustment
		ZonedDateTime zmyDateTimeEclipse=ZonedDateTime.of(myDateTime1, zid1);
		ZonedDateTime znextThursday=zmyDateTimeEclipse.with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
		ZonedDateTime znextMonth=zmyDateTimeEclipse.with(TemporalAdjusters.firstDayOfMonth());
		ZonedDateTime znextYear=zmyDateTimeEclipse.with(TemporalAdjusters.firstDayOfNextYear());
		ZonedDateTime zmyParsedDateTime=ZonedDateTime.parse("2019-03-15T10:20:15.220-07:00");
		ZonedDateTime zmycreatedDateTime=ZonedDateTime.of(myDateTime3, ZoneId.of("GMT-7"));
		OffsetDateTime OffMyDateTime=OffsetDateTime.of(2019, 12, 31, 23, 50, 52, 525, ZoneOffset.of("+8"));
		
		
		System.out.println("zmyDateTimeEclipse: "+zmyDateTimeEclipse);
		System.out.println("znextThursday: "+znextThursday);
		System.out.println("znextMonth: "+znextMonth);
		System.out.println("znextYear: "+znextYear);
		System.out.println("zmyParsedDateTime: "+zmyParsedDateTime);
		System.out.println("zmycreatedDateTime: "+zmycreatedDateTime);
		System.out.println("OffMyDateTime: "+OffMyDateTime);
		System.out.println("------------------------\n\n");
		
		
		
		//Period
		Period p1m=Period.ofMonths(2);
		ZonedDateTime reminder=zmyDateTimeEclipse.minus(p1m);
		ZonedDateTime reminderInKol=reminder.withZoneSameInstant(zid2);
		
		System.out.println("p1m: "+p1m);
		System.out.println("reminder:"+reminder);
		System.out.println("reminderInKol: "+reminderInKol);
		System.out.println("------------------------\n\n");
		
		//Duration
		LocalTime begins=LocalTime.of(10, 20, 30);
		LocalTime ends=LocalTime.of(10, 50, 40);
		long seconds=ChronoUnit.SECONDS.between(begins, ends);
		Duration between=Duration.ofSeconds(seconds);
		Duration between2=Duration.between(begins, ends);
		
		System.out.println("between: "+between);
		System.out.println("between2: "+between2);
		System.out.println(begins.plus(between));
		System.out.println("------------------------\n\n");
		
		//Instant
		Instant myInstant1=Instant.now();
		Instant myInstant2=Instant.EPOCH;
		Instant eclipseInstant=zmyDateTimeEclipse.toInstant();
		Instant a1=myDateTime1.toInstant(ZoneOffset.of("+5"));
		
		System.out.println("myInstant1: "+myInstant1);
		System.out.println("myInstant2: "+myInstant2);
		System.out.println("eclipseInstant: "+eclipseInstant);
		System.out.println(myInstant1.getEpochSecond());
		System.out.println(a1);
		
		
		LocalDate lc1=zmyDateTimeEclipse.toLocalDate();
		System.out.println("Is leap year: "+ lc1.isLeapYear());
		System.out.println("Is 2016 a leap year? ans: "+ Year.of(2016).isLeap());
		System.out.println("------------------------\n\n");		
		
		
	
		//Date-time Formatter
		System.out.println(zmyDateTimeEclipse.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL).withLocale(Locale.UK)));
		System.out.println(zmyDateTimeEclipse.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG).withLocale(Locale.UK)));
		System.out.println(zmyDateTimeEclipse.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM).withLocale(Locale.UK)));
		System.out.println(zmyDateTimeEclipse.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).withLocale(Locale.UK)));
		System.out.println("------------------------\n\n");	
		
		
		
		//Locale
		LocalDateTime forLocal=LocalDateTime.now();
		ZonedDateTime zforLocal=ZonedDateTime.of(forLocal, zid2);
		Locale myLocal=Locale.getDefault();
		System.out.println("myLocal: "+myLocal);
		System.out.println("forLocal: "+forLocal);
		System.out.println("zforLocal: "+zforLocal);
		Locale locHin=new Locale("hi");
		Locale locHinIn=new Locale("hi","IN");
		Locale locPortIn=new Locale("pt","IN");
		
		System.out.println(forLocal.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
		System.out.println(zforLocal.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).withLocale(locHin)));
		System.out.println(zforLocal.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(locHinIn)));
		System.out.println(zforLocal.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).withLocale(locPortIn)));
		System.out.println(forLocal.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(locPortIn)));
//Only upto MEDIUM can be used for LocalDateTime, not LONG not FULL.
		System.out.println(locHin.getDisplayLanguage());
		System.out.println(locHin.getDisplayCountry());
		System.out.println(locHinIn.getDisplayLanguage());
		System.out.println(locHinIn.getDisplayCountry());
		System.out.println(locPortIn.getDisplayLanguage());
		System.out.println(locPortIn.getDisplayCountry());
		System.out.println(locPortIn.getDisplayLanguage(locPortIn));
		System.out.println(locPortIn.getDisplayCountry(locPortIn));
		System.out.println("------------------------\n\n");	

		
		
	}

}
