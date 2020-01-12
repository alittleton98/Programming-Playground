//Class for Natural Element Objects
#include <atom.h>

class atom
{
private:
    int protons;
    int neutrons;
    int electrons;

public:
    atom::atom() : protons{1}, neutrons{1}, electrons{1}
    {
    }

    atom::atom(int p, int n, int e)
    {
        protons = p;
        neutrons = n;
        electrons = e;
    }

    atom::atom(const atom &other)
    {
        int p = other.getProtons;
        int n = other.getNeutrons;
        int e = other.getElectrons;
        atom newAtom = atom(p, n, e);
    }

    int atom::getProtons() const
    {
        return protons;
    }

    int atom::getNeutrons() const
    {
        return neutrons;
    }

    int atom::getElectrons() const
    {
        return electrons;
    }
    atom atom::fusion(atom &a)
    {
        int fusedProtons = protons + a.getProtons();
        int fusedNeutrons = neutrons + a.getNeutrons();
        int fusedElectrons = electrons + a.getElectrons();
        atom compound = atom(fusedProtons, fusedNeutrons, fusedElectrons);
        return compound;
        atom::~atom();
    }
    /*
    friend atom atom::operator+(atom &a, atom &b)
    {
        int fusedProtons = b.protons() + a.getProtons();
        int fusedNeutrons = b.getNeutrons() + a.getNeutrons();
        int fusedElectrons = b.getElectrons() + a.getElectrons();
        atom compound = Atom(fusedProtons, fusedNeutrons, fusedElectrons);
        return compound;
    }
*/
    atom::~atom()
    {
        delete this;
    }
};
