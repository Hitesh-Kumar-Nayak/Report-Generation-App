package in.ashokit.report;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import in.ashokit.entity.CitizenPlan;
import in.ashokit.repo.CitizenPlanRepo;
import in.ashokit.search.SearchRequest;

@Service
public class ReportServiceImpl implements ReportService {
	
	@Autowired
	private CitizenPlanRepo planRepo;
	
	@Override
	public List<String> getPlanNames() {
	return planRepo.getPlanNames();
		
		
	}
	@Override
	public List<String> getPlanStatuses() {
		return planRepo.getPlanStatuses();
	
		
	}
	@Override
	public List<CitizenPlan> search(SearchRequest request) {
		 
		CitizenPlan entity = new CitizenPlan();
		if(null!=request.getPlanName() && !"".equals(request.getPlanName())) {
			entity.setPlanName(request.getPlanName());
		}
		if(null!=request.getPlanStatus() && !"".equals(request.getPlanStatus())) {
			entity.setPlanStatus(request.getPlanStatus());
			
      }
			if(null!=request.getGender() && !"".equals(request.getGender())) {
				entity.setGender(request.getGender());
				
	  }	
			if(null!=request.getStartDate() && !"".equals(request.getStartDate())) {
				String startDate = request.getStartDate();
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
				
				//Convert String to LocalDate
				
				LocalDate localdate =LocalDate.parse(startDate,formatter);
				entity.setPlanStartDate(localdate);
				
		}
			if(null!=request.getEndDate() && !"".equals(request.getEndDate())) {
				String endDate = request.getEndDate();
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
				
				//Convert String to LocalDate
				
				LocalDate localdate =LocalDate.parse(endDate,formatter);
				entity.setPlanEndDate(localdate);
				
			}


	
		 return planRepo.findAll(Example.of(entity));
	}
		
		
		
	@Override
	public boolean exportExcel() {
		
		return false;
	}
	@Override
	public boolean exportPdf() {
		
		return false;
	}

}
