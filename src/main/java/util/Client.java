package util;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

import org.supermarket.entity.Customer;
import org.supermarket.entity.enumP.Gender;
import org.supermarket.entity.enumP.Option;

public class Client {
	public static void main(String[] args) {
		
	}

	public static Remote connectTo(int port, Option option)
			throws RemoteException, MalformedURLException, NotBoundException {
		String res = "rmi://localhost:" + port + "/" + option.getValue();
		return Naming.lookup(res);
	}
}
