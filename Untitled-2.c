/* The compiler's standard-header path is not configured in the IDE. */
int printf(const char *format, ...);
int scanf(const char *format, ...);
#define MAX 5
 
int stack[MAX];
int top = -1;
 
void push() {
    int val;
    if (top == MAX - 1) { printf("Stack Overflow!\n"); return; }
    printf("Enter value to push: ");
    scanf("%d", &val);
    stack[++top] = val;
    printf("%d pushed to stack.\n", val);
}
 
void pop() {
    if (top == -1) { printf("Stack Underflow!\n"); return; }
    printf("Popped element: %d\n", stack[top--]);
}
 
void display() {
    if (top == -1) { printf("Stack is empty.\n"); return; }
    printf("Stack (top -> bottom): ");
    for (int i = top; i >= 0; i--) printf("%d ", stack[i]);
    printf("\n");
}
 
void checkPalindrome() {
    char str[100];
    int s[100], t = -1, isPalin = 1;
    printf("Enter a string/number to check palindrome: ");
    scanf("%s", str);
    int len = 0;
    while (str[len] != '\0') { s[++t] = str[len]; len++; }
    for (int i = 0; i < len; i++) {
        if (str[i] != s[t--]) { isPalin = 0; break; }
    }
    if (isPalin) printf("\"%s\" is a Palindrome.\n", str);
    else printf("\"%s\" is NOT a Palindrome.\n", str);
}
 
int main() {
    int choice;
    do {
        printf("\n----- STACK MENU (MAX=%d) -----\n", MAX);
        printf("1. Push\n2. Pop\n3. Check Palindrome\n4. Demonstrate Overflow/Underflow\n5. Display Stack\n6. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);
        switch (choice) {
            case 1: push(); break;
            case 2: pop(); break;
            case 3: checkPalindrome(); break;
            case 4:
                printf("-- Underflow demo --\n");
                while (top != -1) pop();
                pop();
                printf("-- Overflow demo --\n");
                for (int i = 0; i <= MAX; i++) {
                    if (top == MAX - 1) { printf("Stack Overflow!\n"); break; }
                    stack[++top] = i;
                    printf("%d pushed to stack.\n", i);
                }
                break;
            case 5: display(); break;
            case 6: printf("Exiting...\n"); break;
            default: printf("Invalid choice!\n");
        }
    } while (choice != 6);
    return 0;
}
 
