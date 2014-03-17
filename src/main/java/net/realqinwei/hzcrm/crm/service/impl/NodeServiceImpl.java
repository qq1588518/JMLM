package net.realqinwei.hzcrm.crm.service.impl;

import net.realqinwei.hzcrm.crm.been.Node;
import net.realqinwei.hzcrm.crm.been.User;
import net.realqinwei.hzcrm.crm.dao.intf.NodeDAO;
import net.realqinwei.hzcrm.crm.service.intf.NodeService;
import net.realqinwei.hzcrm.crm.util.MD5;

import java.util.ArrayList;
import java.util.List;

public final class NodeServiceImpl implements NodeService {
	
	private NodeDAO nodeDAO;

	@Override
	public boolean nodeIDExist(Integer userID) {
		return null == this.getNodeDAO().findNodeByID(userID) ? false : true;
	}
	
	public void setNodeDAO(NodeDAO nodeDAO) {
		this.nodeDAO = nodeDAO;
	}
	
	public NodeDAO getNodeDAO() {
		return nodeDAO;
	}

	@Override
	public void save(Node node) {
		this.nodeDAO.saveNode(node);
	}

	@Override
	public void update(Node node) {
		this.nodeDAO.updateNode(node);
	}
	
	@Override
	public List<Node> getNodes() {
		List<Node> users = new ArrayList<Node>();
		for (Node u: this.nodeDAO.findAll()) {
			u.setUserName(u.getUserName() + "K");
			users.add(u);
		}
		return users;
	}

    @Override
    public List<Node> findByOwner(User user) {
        return null;
    }
}