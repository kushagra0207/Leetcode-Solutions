class Solution {
    // public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
    
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
    
    
        int total = (C - A) * (D - B) + (G - E) * (H - F);
        if (C <= E || B >= H || A >= G || D<= F) {
            return total;
        }
        //if has overlap
        int a = Math.min(C, G) - Math.max(A, E);
        int b = Math.min(D, H) - Math.max(B, F);
        int dup = a * b;
        return total - dup;
        
    }
}