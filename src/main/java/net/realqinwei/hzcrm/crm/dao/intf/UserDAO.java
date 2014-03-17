package net.realqinwei.hzcrm.crm.dao.intf;

import net.realqinwei.hzcrm.crm.been.User;

import java.util.List;

public interface UserDAO {
	
	public void saveUser(User user);
	public void removeUser(User user);
	public User findUserByID(Integer id);
	public List<User> findAll();
	public void updateUser(User user);

}