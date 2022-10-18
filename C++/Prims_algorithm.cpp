#include <algorithm>
#include <iostream>
#include <list>
#include <queue>
#include <unordered_set>
#include <vector>
using namespace std;

typedef pair<int, int> iPair;
typedef vector<list<iPair>> lists;

class edgeComp {
public:
    bool operator()(vector<int> &e1, vector<int> &e2) {
        return e1[2] > e2[2];
    }
};

struct Graph {
    int numVertices;
    vector<vector<int>> edges;
    lists adjLists;
    unordered_set<int> visited;

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

    void prims(int start) {
        priority_queue<vector<int>, vector<vector<int>>, edgeComp> minHeap;
        vector<vector<int>> MST;

        for (iPair vw_pair : adjLists[start]) {
            minHeap.push({start, vw_pair.first, vw_pair.second});
        }
        visited.insert(start);

        int sum = 0;

        while (!minHeap.empty() || visited.size() < numVertices) {
            vector<int> edge = minHeap.top();
            minHeap.pop();
            int u = edge[0], v = edge[1], w = edge[2];
            if (!visited.count(v)) {
                visited.insert(v);
                MST.push_back(edge);
                sum += w;
                for (iPair vw_pair : adjLists[v]) {
                    if (!visited.count(vw_pair.first)) {
                        minHeap.push({v, vw_pair.first, vw_pair.second});
                    }
                }
            }
        }

        cout << sum << endl;
    }

private:
    // utility function that gets passed into the sort() function to
    // sort a vector of vectors using the third element
    static bool vectorSortFunc(const vector<int> &vec1, const vector<int> &vec2) {
        return vec1[2] < vec2[2];
    }
};

int main() {
    //
    // Graph *G = new Graph(8);
    // G->addEdge(1, 2, 8);
    // G->addEdge(1, 6, 5);
    // G->addEdge(5, 1, 1);
    // G->addEdge(1, 3, 5);
    // G->addEdge(7, 5, 3);
    // G->addEdge(4, 7, 6);
    // G->addEdge(7, 3, 4);
    // G->addEdge(4, 2, 4);
    // G->addEdge(6, 4, 9);
    // G->addEdge(0, 3, 4);
    // G->addEdge(2, 0, 5);
    // G->print();
    // cout << "=======================" << endl;

    int n, m, start;
    cin >> n >> m;
    Graph *G = new Graph(n);
    for (int i = 0; i < m; i++) {
        int u, v, w;
        cin >> u >> v >> w;
        G->addEdge(u, v, w);
    }

    cin >> start;

    G->prims(start - 1);
    return 0;
}