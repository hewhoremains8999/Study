from collections import deque

graph = {
'A': ['B', 'C'],
'B': ['D', 'E'],
'C': ['F'],
'D': [],
'E': [],
'F': []
}

def bfs(graph, start):
 
visited = set()

queue = deque([start])

print("BFS Traversal:")

while queue:

node = queue.popleft()


if node not in visited:

print(node, end=" ")

visited.add(node)

for neighbour in graph[node]:

if neighbour not in visited:
queue.append(neighbour)

bfs(graph, 'A')
from collections import deque

dict_gn = {
"Arad": ["Zerind", "Sibiu", "Timisoara"],
"Zerind": ["Arad", "Oradea"],
"Oradea": ["Zerind", "Sibiu"],
"Sibiu": ["Arad", "Oradea", "Fagaras", "Rimnicu Vilcea"],
"Timisoara": ["Arad", "Lugoj"],
"Lugoj": ["Timisoara", "Mehadia"],
"Mehadia": ["Lugoj", "Drobeta"],
"Drobeta": ["Mehadia", "Craiova"],
"Craiova": ["Drobeta", "Rimnicu Vilcea", "Pitesti"],
"Rimnicu Vilcea": ["Sibiu", "Craiova", "Pitesti"],
"Fagaras": ["Sibiu", "Bucharest"],
"Pitesti": ["Rimnicu Vilcea", "Craiova", "Bucharest"],
"Bucharest": ["Fagaras", "Pitesti", "Giurgiu", "Urziceni"],
"Giurgiu": ["Bucharest"],
"Urziceni": ["Bucharest", "Hirsova", "Vaslui"],
"Hirsova": ["Urziceni", "Eforie"],
"Eforie": ["Hirsova"],
"Vaslui": ["Urziceni", "Iasi"],
"Iasi": ["Vaslui", "Neamt"],
"Neamt": ["Iasi"]
}
start = "Arad"
goal = "Bucharest"
def bfs(graph, start, goal):
    visited = set()
while queue:
path = queue.popleft()
node = path[-1]
if node == goal:
return path
if node not in visited:
visited.add(node)
for neighbour in graph[node]:
if neighbour not in visited:
new_path = list(path)
new_path.append(neighbour)
queue.append(new_path)
return None
path = bfs(dict_gn, start, goal)
if path:
print("Breadth First Search Path:")
print(" -> ".join(path))
else:
print("No path found.")
