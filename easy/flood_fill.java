class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (color != image[sr][sc]){ // checks if starting pixel is given color
            fill(image, sr, sc, color, image[sr][sc]);
        }
        return image;
    }
    
    // function that recursively calls itself to fill in boxes (DFS)
    public void fill(int[][] image, int sr, int sc, int color, int ogColor) {
        // sr < 0 and sr >= image.length checks bounds of rows
        // sc < 0 and sc >= image[sr].length checks bounds of columns
        // image[sr][sc] != ogColor checks if pixel should be changed
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[sr].length || image[sr][sc] != ogColor) {
            return;
        }
        image[sr][sc] = color; // changes color of current pixel
        fill(image, sr + 1, sc, color, ogColor); // pixel below
        fill(image, sr - 1, sc, color, ogColor); // pixel above
        fill(image, sr, sc + 1, color, ogColor); // pixel right
        fill(image, sr, sc - 1, color, ogColor); // pixel left
    }
}