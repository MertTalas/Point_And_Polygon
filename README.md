# DataStructuresandAlgorithms_Project1
1) Create a new data structures to represent Lines/Polygons which are formed of linked Points. A point object is a point in 2D space which can connect to other Points.  A Point can connect only by only one point. A Polygon is another object which is formed of different points linked to each other. Your program has the following properties 
a. Point is an object which stores 2D coordinates, has toString() 
b. Points can calculate distance to other points using Euclidean distance 
c. A polygon is formed of linked points. 
d. Your program must be able to create polygons  i. with the user given Point positions (x and y) ii. with a given stack of Points iii. with a given queue of Points iv. please provide appropriate constructors/methods. 
e. Polygon can add and remove Points. 
f. Has toString method which describes polygon 
g. Stores number of points. 
h. Polygon points can be reversed in the order. You can use a stack to implement this or change inner references (first-last) Reverse(P1->P2->P3) --- (P3->P2->P1) 
i. Polygon points can be given out as an array. 
j. A polygon can be incomplete. It does not have to be a closed structure. A single point or two points can form a polygon object.
k. Polygon class is intelligent. When a new point is added to the polygon it checks whether the polygon becomes a closed object like P4-P5 (Figure 1). If it does, then it does not allow adding more points. E.g. Give a message “ polygon  is closed” 
l. An open can close itself with a method. 
m. An open polygon gets closed if user enters the first point of the polygon for the second time. 
n. An open or closed polygon can calculate its total length by adding distances between all consecutive points. 
o. A closed polygon can calculate its area by just knowing its vertices provided that polygon is not self-intersecting.
p. An open polygon can be added with another polygon. Closed polygons can not be concatenated. 
