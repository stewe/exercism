#[derive(PartialEq, Debug)]
pub struct RibonucleicAcid {
    strand: String,
}

#[derive(PartialEq)]
pub struct DeoxyribonucleicAcid {
    strand: String,
}

impl RibonucleicAcid {
    pub fn new(rna: &str) -> Self {
        RibonucleicAcid { strand: rna.to_string() }
    }
    pub fn as_ref(&self) -> &str {
        self.strand.as_ref()
    }
}

impl DeoxyribonucleicAcid {
    pub fn new(dna: &str) -> Self {
        DeoxyribonucleicAcid { strand: dna.to_string() }
    }
    pub fn to_rna(&self) -> RibonucleicAcid {
        let mut rna = String::new();
        for c in self.strand.chars() {
            match c {
                'G' => rna.push('C'),
                'C' => rna.push('G'),
                'T' => rna.push('A'),
                'A' => rna.push('U'),
                _ => panic!()
            }
        }
        RibonucleicAcid::new(rna.as_ref())
    }
}
