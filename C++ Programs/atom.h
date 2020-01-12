class atom
{
private:
    int protons;
    int neutrons;
    int electrons;

public:
    atom();
    atom(int p, int n, int e);
    atom(const atom &other);

    int getProtons();

    int getNeutrons();
    int getElectrons();
    atom fusion(atom &a);
    friend atom operator+(atom &a, atom &b);

    ~atom();
};