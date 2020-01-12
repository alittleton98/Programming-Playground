import Cocoa




func hash (toBeHashed: String) -> String{
    var originalPhrase = toBeHashed
    var hashed = ""
    var hashArr = [Character]()
    var strelement: Character
    
    for i in originalPhrase{
        hashArr.append(i)
    }
    for j in hashArr{ //find out how to get index position of hashArr
        hasher(unhashedChar: j) //hashArr at index should be replaced hasher return value.
    }
    
    hashed = String(hashArr)
    
    
    return hashed
    
}

func hasher (unhashedChar: Character) -> Character{
    var unhashedChar = unhashedChar
    var hashedChar :Character
    hashedChar = Character("")
    
    return hashedChar
}

