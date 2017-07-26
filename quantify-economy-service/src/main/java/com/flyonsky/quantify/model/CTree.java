package com.flyonsky.quantify.model;

import java.util.ArrayList;
import java.util.List;

public class CTree<K,V>  {
	
	private List<CTreeNode<K,V>> childrens=new ArrayList<CTreeNode<K,V>>();
	
	public List<CTreeNode<K, V>> getChildrens() {
		return childrens;
	}

	public void setChildrens(List<CTreeNode<K, V>> childrens) {
		this.childrens = childrens;
	}

	/**
	 * 加载树，把关系数据转换成树
	 * @param list
	 * @param handle
	 * @param root
	 */
	public void loadList(List<V> list,LoadHandle<K,V> handle,K root){
		list=list.subList(0, list.size());// 拷贝因为后续会被处理掉
		loadNode(childrens,list,handle,root);
	}
	
	
	private void loadNode(List<CTreeNode<K,V>> childrens,List<V> list,LoadHandle<K,V> handle,K parent){
		for(int i=0;i<list.size();i++){
			V item=list.get(i);
			K id=handle.getId(item);
			String name=handle.getName(item);
			K parentId=handle.getParentId(item);
			if(parent==parentId || parentId.equals(parent)){
				CTreeNode<K, V> e=new CTreeNode<K, V>();
				e.setValue(item);
				e.setId(id);
				e.setName(name);
				childrens.add(e);
				list.remove(i);  //移出已经获取的数据，避免重复判断
				i--;
			}
		}
		
		for(CTreeNode<K, V> e :childrens){
			loadNode(e.getChildrens(),list,handle,e.getId());
		}
		
	}
	
	
	public static interface LoadHandle<K,V>{
		K getId(V item);
		String getName(V item);
		K getParentId(V item);
	}
	
	
	public static class CTreeNode<K,V>{
		private K id;
		
		private String name;
		
		private V value;
		
		private CTreeNode<K,V> parent;
		
		public K getId() {
			return id;
		}

		public void setId(K id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public V getValue() {
			return value;
		}

		public void setValue(V value) {
			this.value = value;
		}

		public CTreeNode<K, V> getParent() {
			return parent;
		}

		public void setParent(CTreeNode<K, V> parent) {
			this.parent = parent;
		}

		public List<CTreeNode<K, V>> getChildrens() {
			return childrens;
		}

		public void setChildrens(List<CTreeNode<K, V>> childrens) {
			this.childrens = childrens;
		}

		private List<CTreeNode<K,V>> childrens=new ArrayList<CTreeNode<K,V>>();
	}

}
