class Solution:
    def entityParser(self, text: str) -> str:
        pattern4Quot = re.compile(r'\&quot\;')
        pattern4Apos = re.compile(r'\&apos\;')
        pattern4Amp = re.compile(r'\&amp\;')
        pattern4Gt = re.compile(r'\&gt\;')
        pattern4Lt = re.compile(r'\&lt\;')
        pattern4Frasl = re.compile(r'\&frasl\;')
        
        text = pattern4Quot.sub('"' ,text)
        text = pattern4Apos.sub("'" ,text)
        text = pattern4Gt.sub(">" ,text)
        text = pattern4Lt.sub("<" ,text)
        text = pattern4Frasl.sub("/" ,text)
        text = pattern4Amp.sub("&" ,text)
        return text