class Solution {
    /**
     * @param {string} s
     * @return {number}
     */
    lengthOfLongestSubstring(s) {
        let left=0,maxLen=0;
        let map=new Map();

        for(let right=0;right<s.length;right++)
        {
            let char=s[right];
            if(map.has(char))
            {
                left=Math.max(left, map.get(char)+1);
            }
            map.set(char, right);
            maxLen=Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }
}
