class Solution {
  public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

    // Depth first search-like approach to leetcode flood fill problem
    if (image[sr][sc] == newColor)
      return image;

    int oldColor = image[sr][sc];
    Stack<Coordinate> stack = new Stack<>();
    stack.push(new Coordinate(sr, sc));

    while (!stack.empty()) {
      Coordinate curr = stack.pop();
      image[curr.sr][curr.sc] = newColor;

      if (curr.sr - 1 >= 0 && image[curr.sr - 1][curr.sc] == oldColor)
        stack.push(new Coordinate(curr.sr - 1, curr.sc));
      if (curr.sc - 1 >= 0 && image[curr.sr][curr.sc - 1] == oldColor)
        stack.push(new Coordinate(curr.sr, curr.sc - 1));

      if (curr.sr + 1 < image.length && image[curr.sr + 1][curr.sc] == oldColor)
        stack.push(new Coordinate(curr.sr + 1, curr.sc));
      if (curr.sc + 1 < image[0].length && image[curr.sr][curr.sc + 1] == oldColor)
        stack.push(new Coordinate(curr.sr, curr.sc + 1));
    }

    return image;
  }


  class Coordinate {
    int sr;
    int sc;

    Coordinate (int sr, int sc) {
    this.sr = sr;
    this.sc = sc;
    }
  }
}
