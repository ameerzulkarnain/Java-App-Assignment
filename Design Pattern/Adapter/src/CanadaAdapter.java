
public class CanadaAdapter extends CAAddress implements AddressValidator {
//	public CAAddress canadaaddress;
//	public CanadaAdapter(CAAddress a) {
//		this.canadaaddress = a;
//	}

	@Override
	public boolean isValidAddress(String inp_address, String inp_zip, String inp_state) {

		return isValidAddressCanada(inp_address, inp_zip, inp_state);

	}

}
