class 	Leetcodejune18 {
   public int hIndex(int[] citations) {
    if(citations == null) return 0;
    int i = 0, n = citations.length;
    int mid, si = 0, ei = n - 1;
    int res = 0;
    while (si <= ei) {
      mid = si + (ei - si) / 2;
      if (citations[mid] == n - mid) return n - mid;
      else if (citations[mid] < n - mid) si = mid + 1;
      else{
          res = n - mid;
          ei = mid - 1;
      } 
    }
    return res;
}
}