// https://www.hackerrank.com/challenges/dijkstrashortreach/problem
#include <algorithm>
#include <iostream>
#include <list>
#include <queue>
#include <set>
#include <unordered_map>
#include <vector>
using namespace std;

typedef pair<int, int> iPair;
typedef vector<list<iPair>> lists;

struct Graph {
    int numVertices;
    vector<vector<int>> edges;
    lists adjLists;
    vector<int> d;

    Graph(int n) {
        numVertices = n;
        adjLists = lists(n);
    }
    void addEdge(int u, int v, int w) {
        // when nodes start counting from 1
        --u, --v;
        edges.push_back({u, v, w});
        adjLists[u].push_back(make_pair(v, w));
        adjLists[v].push_back(make_pair(u, w));
    }

    void print() {
        int i = 0;
        for (list<iPair> l : adjLists) {
            cout << i;
            for (iPair vw_pair : l) {
                cout << " => (" << vw_pair.first << ", " << vw_pair.second << ")";
            }
            cout << endl;
            i++;
        }
    }

    void dijkstra(int start) {
        vector<int> d;
        vector<int> parent;
        numVertices;

        d.assign(numVertices, 2147483647);
        parent.assign(numVertices, -1);

        d[start] = 0;
        priority_queue<iPair, vector<iPair>, greater<iPair>> q;
        q.push({0, start});

        while (!q.empty()) {
            int u = q.top().second;
            int d_u = q.top().first;
            q.pop();

            if (d_u != d[u]) {
                continue;
            }

            for (auto edge : adjLists[u]) {
                int v = edge.first;
                int len = edge.second;

                if (d[u] + len < d[v]) {
                    d[v] = d[u] + len;
                    parent[v] = u;
                    q.push({d[v], v});
                }
            }
        }

        for (int i = 0; i < numVertices; i++) {
            if (i != start) {
                if (d[i] == 2147483647) {
                    cout << "-1 ";
                } else {
                    cout << d[i] << " ";
                }
            }
        }
        cout << endl;
    }
};

int main() {

    int t;
    cin >> t;
    for (int i = 0; i < t; i++) {
        int n, m, start;
        cin >> n >> m;
        Graph *G = new Graph(n);
        for (int i = 0; i < m; i++) {
            int u, v, w;
            cin >> u >> v >> w;
            G->addEdge(u, v, w);
        }
        cin >> start;
        G->dijkstra(start - 1);
        delete G;
    }

    return 0;
}
