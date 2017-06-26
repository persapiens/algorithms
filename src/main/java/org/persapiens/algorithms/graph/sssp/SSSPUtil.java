package org.persapiens.algorithms.graph.sssp;

import org.persapiens.algorithms.graph.ListGraph;
import static org.persapiens.algorithms.graph.Matrix.INFINITY;
import org.persapiens.algorithms.graph.Vertex;
import static org.persapiens.algorithms.graph.Vertex.NIL;

/**
 *
 * @author marcelo fernandes
 */
public class SSSPUtil {	
	public static void initializeSingleSource(ListGraph graph, Vertex s) {
		for(Vertex v: graph.getVertexes()) {
			v.setD(INFINITY);
			v.setParent(NIL);
		}
		s.setD(0);
	}
}
