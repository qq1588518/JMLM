package net.realqinwei.hzcrm.crm.domain;

import java.util.SortedSet;

import net.earthcoder.jmlm.domain.BinaryTree;
import net.earthcoder.jmlm.domain.TreeFactory;
import net.realqinwei.hzcrm.crm.been.Node;
import net.realqinwei.hzcrm.crm.domain.exception.AddErrorException;

public final class TreeRepository {

	private TreeFactory treeFactory;
	
	public void setTreeFactory(TreeFactory treeFactory) {
		this.treeFactory = treeFactory;
	}
	
	public TreeFactory getTreeFactory() {
		return treeFactory;
	}
	
	public TreeComponent<Node> getTree() {
		TreeComponent<Node> tree = null;
		try {
			tree = getTreeFactory().getTree();
		} catch (AddErrorException e) {
			e.printStackTrace();
		}
		return tree;
	}
	
	public SortedSet<Node> getBill() {
		return treeFactory.getBill();
	}

    public BinaryTree rebuild() {
          return treeFactory.getBinaryTree();
    }

    public SortedSet<Node> getBinaryBill() {
        return treeFactory.getBinaryBill();
    }
}
