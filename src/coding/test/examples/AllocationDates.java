package coding.test.examples;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class AllocationDates {
	
	private static class Allocation{
		private int personal;
		private int group;
		private int managing;
		private LocalDate date;
		
		public static Allocation getAllocation(int personal,int group,int managing,LocalDate date) {
			if(personal+group+managing !=100) {
				return getDefaultAllocation(date);
			}
			Allocation allocation = new Allocation();
			allocation.personal=personal;
			allocation.group=group;
			allocation.managing=managing;
			allocation.date=date;
			return allocation;
			
		}
		
		public static Allocation getDefaultAllocation(LocalDate date) {
			Allocation defaultAllocation = new Allocation();
			defaultAllocation.personal=50;
			defaultAllocation.group=20;
			defaultAllocation.managing=30;
			defaultAllocation.date=date;
			return defaultAllocation;
		}
	}
	
	public static String getTimeSpend( List<Allocation> allocationList,LocalDate startDate,LocalDate endDate) {
		
		double personalSum=0;
		double groupSum=0;
		double managingSum=0;
		int count=0;
		
		for(Allocation allocation : allocationList) {
			if(!( allocation.date.isAfter(endDate) || allocation.date.isBefore(startDate)) ) {
				count++;
				personalSum=personalSum+allocation.personal;
				groupSum=groupSum+allocation.group;
				managingSum=managingSum+allocation.managing;
			}
		}
		if(count==0) {
			count=1;
		}
		DecimalFormat dfZero = new DecimalFormat("0.00");
		return "Personal coaching: "+dfZero.format(personalSum/count)
		 +"% ,Group coaching: "+dfZero.format(groupSum/count)
		 +"% ,Managing:"+dfZero.format(managingSum/count)+"%";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Allocation allocation1 = Allocation.getAllocation(0,0,100,LocalDate.of(2019, 3, 15));
		Allocation allocation2 = Allocation.getAllocation(50,50,50,LocalDate.of(2019, 3, 16));
		Allocation allocation3 = Allocation.getAllocation(20,20,60,LocalDate.of(2019, 3, 17));
		Allocation allocation4 = Allocation.getAllocation(60,0,40,LocalDate.of(2019, 3, 18));
		
		Allocation allocation5 = Allocation.getAllocation(60,0,40,LocalDate.of(2019, 3, 21));
		Allocation allocation6 = Allocation.getAllocation(60,0,40,LocalDate.of(2019, 3, 22));
		
		Allocation[] allocations= {allocation1,allocation2,allocation3,allocation4,allocation5,allocation6};
		
		List<Allocation> allocationList=Arrays.asList(allocations);
		System.out.println(getTimeSpend(allocationList,LocalDate.of(2019, 3, 15),LocalDate.of(2019, 4, 15)));
		
	}

}

//
//A couch could have three types of responsibilities: personal coaching, group coaching and managing coaching.
//They could have two types of allocations: baseline and temporary
//
//Task: Given all data for a single coach and a date interval, calculate the percent of time spent working on each responsibility type. If the data isn't provided for a coach on a specific date, assume that they are performing baseline responsibilities.
//
//Example:
//Baseline- Personal Coaching: 50%, Group: 20%, Managing: 30%
//Temporary: 2019-03-15- Managing: 100%
//Temporary: 2019-03-16- Personal: 50%, Group: 50%, Managing: 50% (Reject this allocation since it doesn't add up to 100%. Hence assume the Baseline Allocation for this date)
//
//The report for 2019-03-14 - 2019-03-15: Personal coaching: 25%, Group coaching: 10%, Managing: 65%
//The report for 2019-03-14 - 2019-03-16: Personal coaching: 33.33%, Group coaching: 13.33%, Managing: 53.33%