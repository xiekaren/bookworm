package kxie.uoa.bookshop.services;

import javax.ws.rs.ext.ContextResolver;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import kxie.uoa.bookshop.domain.User;

public class UserResolver implements ContextResolver<JAXBContext> {
	private JAXBContext _context;

	public UserResolver() {
		try {
			// The JAXV Context should be able to marshal and unmarshal the
			// specified classes.
			_context = JAXBContext.newInstance(User.class);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	@Override
	public JAXBContext getContext(Class<?> type) {
		if (type.equals(User.class)) {
			return _context;
		} else {
			return null;
		}
	}
}