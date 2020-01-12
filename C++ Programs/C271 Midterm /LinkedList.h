namespace LinkedList
{

template <class T>
struct node
{
    T data;
    node *next;
};

class LinkedList
{
private:
    node *head, *tail;

public:
    LinkedList()
    {
        head = nullptr;
        tail = nullptr;
    }
};

} // namespace LinkedList