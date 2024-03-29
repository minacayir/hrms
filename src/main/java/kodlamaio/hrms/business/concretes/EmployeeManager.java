package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.hrms.business.abstracts.EmployeeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployeeDao;
import kodlamaio.hrms.entities.concretes.Employee;



public class EmployeeManager implements EmployeeService{

	
	private EmployeeDao employeeDao;
	
	
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}
	@Override
	public DataResult<List<Employee>> getAll() {
		return new SuccessDataResult<List<Employee>>(this.employeeDao.findAll());
	}
	
	
	@Override
	public Result add(Employee employee) {
		this.employeeDao.save(employee);
      return new SuccessResult("İşveren  eklendi.");
	}
	
	
	

}
