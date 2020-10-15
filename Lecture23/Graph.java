package Lecture23;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;

public class Graph {
	private class Vertex {
		String name;
		HashMap<Vertex, Integer> neighbors;

		Vertex(String name) {
			this.name = name;
			this.neighbors = new HashMap<>();
		}

		public boolean equals(Object other) {
			Vertex ov = (Vertex) other;
			return this.name.equals(ov.name);

		}

		public int hashCode() {
			return this.name.hashCode();
		}

		public void display() {
			String rv = "";
			rv = rv + this.name + "=>";
			Set<Vertex> nbrs = this.neighbors.keySet();
			for (Vertex nbr : nbrs) {
				rv = rv + nbr.name + "(" + this.neighbors.get(nbr) + "), ";
			}
			rv = rv + "END";
			System.out.println(rv);
		}
	}

	HashMap<String, Vertex> vertices;

	public Graph() {
		this.vertices = new HashMap<>();
	}

	public int numVertices() {
		return this.vertices.size();
	}

	public void addVertex(String name) {
		if (this.vertices.containsKey(name)) {
			return;
		}
		Vertex vtx = new Vertex(name);
		this.vertices.put(name, vtx);
	}

	public void removeVertex(String name) {
		if (!this.vertices.containsKey(name)) {
			return;
		}
		Vertex vtx = this.vertices.get(name);
		Set<Vertex> nbrs = vtx.neighbors.keySet();
		for (Vertex nbr : nbrs) {
			nbr.neighbors.remove(vtx);
		}
		this.vertices.remove(name);
	}

	public int numEdges() {
		int rv = 0;
		Collection<Vertex> vtces = this.vertices.values();
		for (Vertex vtx : vtces) {
			rv = rv + vtx.neighbors.size();
		}
		rv = rv / 2;
		return rv;
	}

	public void addEdge(String name1, String name2, int cost) {
		Vertex vtx1 = this.vertices.get(name1);
		Vertex vtx2 = this.vertices.get(name2);

		if (vtx1 == null || vtx2 == null || vtx1.neighbors.containsKey(vtx2)) {
			return;
		}

		vtx1.neighbors.put(vtx2, cost);
		vtx2.neighbors.put(vtx1, cost);
	}

	public void removeEdge(String name1, String name2) {
		Vertex vtx1 = this.vertices.get(name1);
		Vertex vtx2 = this.vertices.get(name2);

		if (vtx1 == null || vtx2 == null || !vtx1.neighbors.containsKey(vtx2)) {
			return;
		}

		vtx1.neighbors.remove(vtx2);
		vtx2.neighbors.remove(vtx1);
	}

	public void display() {
		Collection<Vertex> vtces = this.vertices.values();
		for (Vertex vtx : vtces) {
			vtx.display();
		}
	}

	public boolean hasPath(String name1, String name2) {
		Vertex vtx1 = this.vertices.get(name1);
		Vertex vtx2 = this.vertices.get(name2);

		if (vtx1 == null || vtx2 == null) {
			return false;
		}
		HashMap<Vertex, Boolean> map = new HashMap<>();
		return hasPathBFS(vtx1, vtx2, map);

	}

	private boolean hasPathDFS(Vertex vtx1, Vertex vtx2, HashMap<Vertex, Boolean> map) {
		if (!map.containsKey(vtx1)) {
			map.put(vtx1, true);
		} else {
			return false;
		}

		if (vtx1.neighbors.containsKey(vtx2)) {
			return true;
		}

		Set<Vertex> nbrs = vtx1.neighbors.keySet();
		for (Vertex nbr : nbrs) {
			if (hasPathDFS(nbr, vtx2, map)) {

				return true;
			}
		}
		return false;
	}

	public boolean hasPathBFS(Vertex vtx1, Vertex vtx2, HashMap<Vertex, Boolean> map) {
		LinkedList<Vertex> queue = new LinkedList<>();
		queue.add(vtx1);
		while (!queue.isEmpty()) {
			Vertex rvtx = queue.removeFirst();
			if (!map.containsKey(rvtx)) {
				map.put(rvtx, true);
				if (rvtx.neighbors.containsKey(vtx2)) {
					return true;
				} else {
					Set<Vertex> nbrs = rvtx.neighbors.keySet();
					for (Vertex nbr : nbrs) {
						if (!map.containsKey(nbr)) {
							queue.addLast(nbr);
						}
					}
				}
			}
		}
		return false;

	}

	public void bft() {
		HashMap<Vertex, Boolean> map = new HashMap<>();
		LinkedList<Vertex> queue = new LinkedList<>();
		Collection<Vertex> vtces = this.vertices.values();
		for (Vertex vtx : vtces) {
			if (!map.containsKey(vtx)) {
				queue.add(vtx);
			}
			while (!queue.isEmpty()) {
				Vertex rvtx = queue.removeFirst();
				if (!map.containsKey(rvtx)) {
					map.put(rvtx, true);
					System.out.print(rvtx.name + " ");
					Set<Vertex> nbrs = rvtx.neighbors.keySet();
					for (Vertex nbr : nbrs) {
						if (!map.containsKey(nbr)) {
							queue.addLast(nbr);
						}
					}

				}
			}
		}
		System.out.println();
	}

	public void dft() {
		HashMap<Vertex, Boolean> map = new HashMap<>();
		LinkedList<Vertex> stack = new LinkedList<>();
		Collection<Vertex> vtces = this.vertices.values();
		for (Vertex vtx : vtces) {
			if (!map.containsKey(vtx)) {
				stack.addFirst(vtx);
			}
			while (!stack.isEmpty()) {
				Vertex rvtx = stack.removeFirst();
				if (!map.containsKey(rvtx)) {
					map.put(rvtx, true);
					System.out.print(rvtx.name + " ");
					Set<Vertex> nbrs = rvtx.neighbors.keySet();
					for (Vertex nbr : nbrs) {
						if (!map.containsKey(nbr)) {
							stack.addFirst(nbr);
						}
					}

				}
			}
		}
		System.out.println();
	}

	public boolean isConnected() {
		HashMap<Vertex, Boolean> map = new HashMap<>();
		LinkedList<Vertex> queue = new LinkedList<>();
		Collection<Vertex> vtces = this.vertices.values();
		queue.add((Vertex) vtces.toArray()[0]);
		while (!queue.isEmpty()) {
			Vertex rvtx = queue.removeFirst();
			if (!map.containsKey(rvtx)) {
				map.put(rvtx, true);
				// System.out.print(rvtx.name + " ");
				Set<Vertex> nbrs = rvtx.neighbors.keySet();
				for (Vertex nbr : nbrs) {
					if (!map.containsKey(nbr)) {
						queue.addLast(nbr);
					}
				}

			}
		}

		return this.vertices.size() == map.size();
	}
}
