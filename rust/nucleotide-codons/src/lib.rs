pub fn parse(v: Vec<(&'static str, &'static str)>) -> Codons {
    Codons { codons: v }
}

pub struct Codons {
    codons: Vec<(&'static str, &'static str)>,
}

impl Codons{
    pub fn name_for(&self, codon: &str) -> Result<&str, &str> {
        if codon.len() != 3 { return Err("") }
        match codon {
            "ATG" => Ok("methionine"),
            "MGR" => Ok("arginine"),
            _ => {
                let (codon_pre, _) = codon.split_at(2);
                for a in self.codons.iter() {
                    let (c, n) = *a;
                    let (c_pre, _) = c.split_at(2);
                    if c_pre == codon_pre {
                        return Ok(n)
                    }
                }
                Err("")
            }
        }
    }
}
