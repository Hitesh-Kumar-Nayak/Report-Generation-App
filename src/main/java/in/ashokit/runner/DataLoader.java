package in.ashokit.runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import in.ashokit.entity.CitizenPlan;
import in.ashokit.repo.CitizenPlanRepo;

@Component
public class DataLoader implements ApplicationRunner {
	
	@Autowired
	private CitizenPlanRepo repo;
	
	

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		repo.deleteAll();
		//CASH PLAN DATA
		CitizenPlan c1 = new CitizenPlan();
		c1.setCitizenName("Hitesh");
		c1.setGender("male");
		c1.setPlanName("cash");
		c1.setPlanStatus("Approved");
		c1.setPlanStartDate(LocalDate.now());
		c1.setPlanEndDate(LocalDate.now().plusMonths(6));
		
		CitizenPlan c2 = new CitizenPlan();
		c2.setCitizenName("Smith");
		c2.setGender("male");
		c2.setPlanName("cash");
		c2.setPlanStatus("Denied");
		c2.setDenialReason("Rental Income");
		
		CitizenPlan c3 = new CitizenPlan();
		c3.setCitizenName("Kirthi");
		c3.setGender("Female");
		c3.setPlanName("cash");
		c3.setPlanStatus("Terminated");
		c3.setPlanStartDate(LocalDate.now().minusMonths(4));
		c3.setPlanEndDate(LocalDate.now().plusMonths(6));
		c3.setBenifitAmt(5000.00);
		c3.setTerminationDate(LocalDate.now());
		c3.setTerminationRsn("Employed");
		
		//FOOD PLAN DATA
		CitizenPlan c4 = new CitizenPlan();
		c4.setCitizenName("Dhoni");
		c4.setGender("male");
		c4.setPlanName("Food");
		c4.setPlanStatus("Approved");
		c4.setPlanStartDate(LocalDate.now());
		c4.setPlanEndDate(LocalDate.now().plusMonths(6));
		
		CitizenPlan c5 = new CitizenPlan();
		c5.setCitizenName("Virat");
		c5.setGender("male");
		c5.setPlanName("Food");
		c5.setPlanStatus("Denied");
		c5.setDenialReason("Property Income");
		
		CitizenPlan c6 = new CitizenPlan();
		c6.setCitizenName("Ananya");
		c6.setGender("Female");
		c6.setPlanName("Food");
		c6.setPlanStatus("Terminated");
		c6.setPlanStartDate(LocalDate.now().minusMonths(4));
		c6.setPlanEndDate(LocalDate.now().plusMonths(6));
		c6.setBenifitAmt(4000.00);
		c6.setTerminationDate(LocalDate.now());
		c6.setTerminationRsn("Employed");
		
		//Medical Plan Data
		
		CitizenPlan c7 = new CitizenPlan();
		c7.setCitizenName("Soumya");
		c7.setGender("male");
		c7.setPlanName("Medical");
		c7.setPlanStatus("Approved");
		c7.setPlanStartDate(LocalDate.now());
		c7.setPlanEndDate(LocalDate.now().plusMonths(6));
		c7.setBenifitAmt(4000.00);
		
		CitizenPlan c8 = new CitizenPlan();
		c8.setCitizenName("Robert");
		c8.setGender("male");
		c8.setPlanName("Medical");
		c8.setPlanStatus("Denied");
		c8.setDenialReason("Property Income");
		
		CitizenPlan c9 = new CitizenPlan();
		c9.setCitizenName("Saxi");
		c9.setGender("Female");
		c9.setPlanName("Medical");
		c9.setPlanStatus("Terminated");
		c9.setPlanStartDate(LocalDate.now().minusMonths(4));
		c9.setPlanEndDate(LocalDate.now().plusMonths(6));
		c9.setBenifitAmt(5000.00);
		c9.setTerminationDate(LocalDate.now());
		c9.setTerminationRsn("Govt job");
		
		CitizenPlan c10 = new CitizenPlan();
		c10.setCitizenName("Biswa");
		c10.setGender("male");
		c10.setPlanName("Employment");
		c10.setPlanStatus("Approved");
		c10.setPlanStartDate(LocalDate.now());
		c10.setPlanEndDate(LocalDate.now().plusMonths(6));
		c10.setBenifitAmt(4000.00);
		
		CitizenPlan c11 = new CitizenPlan();
		c11.setCitizenName("Suraj");
		c11.setGender("male");
		c11.setPlanName("Employment");
		c11.setPlanStatus("Denied");
		c11.setDenialReason("Property Income");
		
		CitizenPlan c12 = new CitizenPlan();
		c12.setCitizenName("Sunny");
		c12.setGender("Female");
		c12.setPlanName("Employment");
		c12.setPlanStatus("Terminated");
		c12.setPlanStartDate(LocalDate.now().minusMonths(4));
		c12.setPlanEndDate(LocalDate.now().plusMonths(6));
		c12.setBenifitAmt(5000.00);
		c12.setTerminationDate(LocalDate.now());
		c12.setTerminationRsn("Govt job");
		
		
		List<CitizenPlan> list = Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12);
		repo.saveAll(list);
		
		
	}

}
