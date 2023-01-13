package tn.enicarthage;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "fullBill",types=Bill.class)
public interface BillProjection {
	
	public long getReference();
	public long getSum();
	public String getSupplierName();
	public String getDate();
	public String getType();

}
